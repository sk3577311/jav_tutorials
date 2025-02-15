package programs;

// canonical constructor by default
// records params are final params
// cannot extends any other class
// cannot create instance variable
// implicitly final classes
// it has compact constructor
public record RecordsPrograms(String name, int employeeNumber) {
    public RecordsPrograms {
        if (employeeNumber < 0) {
            throw new IllegalArgumentException("emp number should be positive.");
        }
    }
}
