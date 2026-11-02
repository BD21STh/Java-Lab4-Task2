import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter; import lombok.Setter;
import lombok.ToString;
@ToString @Setter @Getter @EqualsAndHashCode(onlyExplicitlyIncluded = true) @AllArgsConstructor
public class CarLombok
{ private String model; @EqualsAndHashCode.Include private String brand; private String color;
    private int year, quantity;
    private double price; }
