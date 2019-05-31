import java.util.regex.Pattern

class FWriter {
    String fname, text;

    FWriter(String fname, String text) {
        this.fname = fname;
        this.text = text;
    }

    public void writeFile() {
        File file = new File(fname);
        if (file.exists()) {
            file.write(text);
        } else {
            file.append(text);
        }
    }
}
