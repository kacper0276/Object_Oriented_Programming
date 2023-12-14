public class NumberProcessor implements DataProcessor{
    @Override
    public String processData(String data) {
        if(data == null)
            return data;

        StringBuilder napis = new StringBuilder("Processed: ");
        for(int i = data.length() - 1; i >= 0; i--) {
            napis.append(data.charAt(i));
        }

        return napis.toString();
    }

    @Override
    public boolean isValid(String data) {
        if(data.isEmpty() || data.isBlank() || data == null) {
            return false;
        }

        for(int i = 0; i < data.length(); i++) {
            if(!Character.isDigit(data.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
