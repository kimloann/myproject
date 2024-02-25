package myproject.demo.Model;

import com.mongodb.lang.Nullable;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Data
@Document("user")
public class User {
    @Id
    private String id;
    private String name;
    private String sex;
    private String image;
    @Nullable
    private String managerBy;
    private String department;
    private String company;
    private String wageHour;
    @Nullable
    private Set<String> listEmployee;
    private String role;


}
