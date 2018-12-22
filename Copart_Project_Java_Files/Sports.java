public class Sports
{
    //constructor
    public  Sports(int sportID, int max, String nameGame)
    {
        nameOfGame = nameGame;
        gameID = sportID;
        maxPlayers = max;
    }

    private void setMaxPlayers(int max) {maxPlayers = max;}

    public boolean isFull()
    {
        if (Roster.size() == maxPlayers)
            return true;

        return false;
    }

    public void addDeletePlayer(int ID, int choice, String name)
    {
        //return true if roster is full
        if(isFull()) { System.out.println("Roster is full"); }

        else {

            //if true delete player from list
            if (choice == 1)
            {
                //if user is not in roster
                if(!Roster.containsKey(ID))
                    System.out.println("You are not in the roster");
                else {
                    Roster.remove(ID);
                    System.out.println("Player removed.");
                }
            }

            //otherwise add him
            if(choice == 2)
            {
                if(!Roster.containsKey(ID)) {
                    Roster.put(ID, name);
                    System.out.println("Player added");
                }

            }

        }
    }




    private String nameOfGame;
    private int maxPlayers;
    private int gameID;
    //each sport will have a roster
    private java.util.HashMap<Integer, String> Roster = new java.util.HashMap<Integer, String>();

}
