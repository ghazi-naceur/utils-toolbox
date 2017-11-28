package json;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.*;

@JsonIgnoreProperties({"ignoreparam1", "ignoreparam2"})
public class Person {

    @JsonProperty
    private String lastname;

    @JsonProperty("name")
    private String firstname;

    @JsonProperty
    private String age;

    private String ignoreparam1;

    private String ignoreparam2;

    @JsonProperty
    private List<String> sublings = new ArrayList<>();

    @JsonProperty
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date deathDate;

    private Map<String, Object> addtionalInfo = new HashMap<>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalInfo(){
        return addtionalInfo;
    }

    @JsonAnySetter
    public void setAddtionalInfo(String key, Object value){
        addtionalInfo.put(key, value);
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", ignoreparam1='" + ignoreparam1 + '\'' +
                ", ignoreparam2='" + ignoreparam2 + '\'' +
                ", sublings=" + sublings +
                ", deathDate=" + deathDate +
                ", addtionalInfo=" + addtionalInfo +
                '}';
    }

}
