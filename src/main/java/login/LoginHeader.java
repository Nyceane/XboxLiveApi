package login;


import request_utils.Header;

public class LoginHeader implements Header {

    @Override
    public String[] keys() {
        return new String[]{"Content-Type"};
    }

    @Override
    public String[] values() {
        return new String[]{"application/json"};
    }
}
