package lv.javaguru.lessons.lesson13.registration;

public interface Validator<T> {

    void validate(T target);

    class Assert {
        private Assert() {
        }

        public static void notNull(Object o, String field) {
            if (o == null) {
                throw new ValidationException(field + " must be not null");
            }
        }

        public static void notEmpty(String s, String field) {
            if (s == null || s.trim().isEmpty()) {
                throw new ValidationException(field + " must be not null or empty");
            }
        }
    }

}
