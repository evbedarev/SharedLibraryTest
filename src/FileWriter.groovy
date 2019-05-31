import java.util.regex.Pattern

class FileWriter {
    String fname, text;
    FileWriter(String fname, String text) {
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
