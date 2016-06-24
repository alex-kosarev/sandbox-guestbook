package name.alexkosarev.tutorials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class GuestBook extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(GuestBook.class, args)
                .registerShutdownHook();
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(GuestBook.class);
    }
}
