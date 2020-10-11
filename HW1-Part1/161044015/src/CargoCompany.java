/**
 *  This class holds cargo company users name and surname.
 * @author Medine ASLAN
 */
public class CargoCompany {

    /**
     * Keeps user name and surname in 1 data.
     */
    private String userNameSurname;

    /**
     * Cargo Company constructor.
     * @param nameSurname is init name and surname.
     */
    public CargoCompany(String nameSurname)
    {
        userNameSurname = nameSurname;
    }

    /**
     * Getter method of userNameSurname.
     * @return userNameSurname.
     */
    public String getUserNameSurname()
    {
        return userNameSurname;
    }

}
