public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        String[] sentences1 = capital(sentences);
        keywords = capital(keywords);
        String currentWord = "";
        for(int i = 0; i<sentences1.length; i++) // sent array
        {
            int j = 0;
            currentWord = ""; // word in a sent
            while(j<sentences1[i].length()) //if i didnt reach the end
            {

                if(sentences1[i].charAt(j) == ' ')
                {
                    if(compareToKeywords(currentWord, keywords) == true){
                        System.out.println(sentences[i]);
                        currentWord = "";
                        break;
                    }
                    else{
                        currentWord = "";
                    }
                }
                else{
                    currentWord+=sentences[i].charAt(j);
                }
                j++;
                 
            }
            
        }
    }
    public static boolean compareToKeywords(String s, String[] keywords)

    {

        for(int i = 0; i<keywords.length; i++)
        {
            if(keywords[i].length() == s.length())
            {
                int j = 0;
                while((j<keywords[i].length()) && (s.charAt(j) == keywords[i].charAt(j)))
                {
                    j++;
                }
                if(j == keywords[i].length())
                    return true;
            }
            
        }
        return false;
    }

    public static String[] capital(String[] str)
    {
        String[] newString = new String[str.length];
        for(int i = 0; i<str.length; i++)
        {
            newString[i] = str[i].toLowerCase();
        }
        return newString;
    }
}
