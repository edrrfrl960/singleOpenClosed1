package ie.gmit.single;

/*
 * AUTHOR: Darragh Freeley
 * LAST MODIFIED: 30/03/2020
 * DESCRIPTION: UserPersistenceService allows users to change how information is stored.(Single Responsibility Example)
 */

public class UserPersistenceService {
    private Store store = new Store();

    public void saveUser(User user)
    {
        store.store(user);
    }
}
