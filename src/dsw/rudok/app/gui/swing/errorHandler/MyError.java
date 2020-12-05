package dsw.rudok.app.gui.swing.errorHandler;

public class MyError {

    int code;
    String message;
    String title;

    public MyError(int code, String message, String title){
        this.code = code;
        this.message = message;
        this.title = title;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getTitle() {
        return title;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
