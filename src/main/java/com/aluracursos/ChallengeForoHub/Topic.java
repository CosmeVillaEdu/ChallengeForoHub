import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Entity
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String title;

    @NotEmpty
    private String message;

    private LocalDateTime createdAt = LocalDateTime.now();

    @NotEmpty
    private String status;

    @NotEmpty
    private String author;

    @NotEmpty
    private String course;

    // Getters and Setters
}
