package com.alm.system.enume;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2019-01-02 18:58</p>
 * <p>desc: 用户枚举</p>
 */
public class UserEnum {
    public enum signUp {
        account(1, "account"),
        phone(2, "phone"),
        email(3, "email"),
        ;

        private int id;
        private String name;

        signUp(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
