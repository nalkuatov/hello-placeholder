package kz.kodama.helloplaceholder.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Placeholder {
    @Id @GeneratedValue
    private Long id;
    private String value;

    public Placeholder(String value) {
        this.value = value;
    }
}
