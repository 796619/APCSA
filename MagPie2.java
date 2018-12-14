public class MagPie2
{
    /**
     * Get a default greeting 	
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0
        || statement.indexOf("father") >= 0
        || statement.indexOf("sister") >= 0
        || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else if (statement.indexOf("cat") >= 0
        || statement.indexOf("dog") >= 0
        || statement.indexOf("fish") >= 0
        || statement.indexOf("bird") >= 0)
        {
            response = "Tell me more about your pets.";
        }
        else if (statement.indexOf("Ettlin") >= 0
        || statement.indexOf("Malloy") >=0)
        {
            response = "He must be a great teacher";
        }
        else if (statement.trim().length() == 0){
        response = "Please, say something"; 
    }
    else if (statement.indexOf("volleyball") >= 0
        || statement.indexOf("sport") >= 0
        || statement.indexOf("football") >= 0
        || statement.indexOf("basketball") >= 0
        || statement.indexOf("soccer") >= 0)
        {
            response = "I love sports!";
        }
        else if (statement.indexOf("hello") >= 0
        || statement.indexOf("what's up") >= 0
        || statement.indexOf("hi") >= 0
        || statement.indexOf("hey") >= 0
        || statement.indexOf("greetings") >= 0)
        {
            response = "Hello, how are you";
        }
        else if (statement.indexOf("food") >= 0
        || statement.indexOf("dinner") >= 0
        || statement.indexOf("breakfast") >= 0
        || statement.indexOf("lunch") >= 0
        || statement.indexOf("snack") >= 0)
        {
            response = "food is so good.";
        }
            else
            {
                response = getRandomResponse();
            }
            return response;
        }

        /**
         * Pick a default response to use if nothing else fits.
         * @return a non-committal string
         */
        private String getRandomResponse()
        {
            final int NUMBER_OF_RESPONSES = 4;
            double r = Math.random();
            int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
            String response = "";

            if (whichResponse == 0)
            {
                response = "Interesting, tell me more.";
            }
            else if (whichResponse == 6)
            {
                response = "Hmmm.";
            }
            else if (whichResponse == 5)
            {
                response = "Do you really think so?";
            }
            else if (whichResponse == 4)
            {
                response = "You don't say.";
            }
            else if (whichResponse == 3)
            {
                response = "Haha funny";
            }
            else if (whichResponse == 2)
            {
                response = "Yeah.";
            }
            else if (whichResponse == 1)
            {
                response = "Ummm ok";
            }
            
            

            return response;
        }
    }