package notebook.util;

import notebook.model.User;

public class UserValidator {
    public User validate(User user) {
        if (!isValide(user)){
            throw new IllegalArgumentException("Ошибка валидации данных");
        }
        user.setFirstName(user.getFirstName().replaceAll(" ", " ").trim());
        user.setLastName(user.getLastName().replaceAll(" ", " ").trim());
        user.setPhone(user.getPhone().replaceAll(" ", " ").trim());
        return user;
    }

    private boolean isValide(User user) {
        return!user.getFirstName().isEmpty()
                ||!user.getLastName().isEmpty()
                ||!user.getPhone().isEmpty();
    }
}
