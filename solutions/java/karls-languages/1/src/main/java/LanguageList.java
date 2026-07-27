import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        if (languages.size() < 1){
            return true;
        }
        else {
            return false;
            //.isEmpty()?
        }
    }
    
    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        String result = languages.get(0);
        return result;
    }

    public int count() {
        int result = languages.size();
        return result;
    }

    public boolean containsLanguage(String language) {
        boolean result = languages.contains(language);
        return result;
    }

    public boolean isExciting() {
        boolean result = languages.contains("Java") || languages.contains("Kotlin");
        return result;
    }
}
