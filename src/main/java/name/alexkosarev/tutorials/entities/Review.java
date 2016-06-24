package name.alexkosarev.tutorials.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

@Entity
public class Review implements Serializable {

    private static final long serialVersionUID = 20160624090101L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "TEXT")
    private String reviewText;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date createDate;

    public Review() {
    }

    public Review(String reviewText, Date createDate) {
        this.reviewText = reviewText;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
        hash = 53 * hash + Objects.hashCode(this.reviewText);
        hash = 53 * hash + Objects.hashCode(this.createDate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Review other = (Review) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.reviewText, other.reviewText)) {
            return false;
        }
        return Objects.equals(this.createDate, other.createDate);
    }

    @Override
    public String toString() {
        return "Review{" + "id=" + id + ", reviewText=" + reviewText + ", createDate=" + createDate + '}';
    }
}
