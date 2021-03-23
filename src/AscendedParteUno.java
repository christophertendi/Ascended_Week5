public class AscendedParteUno
{
    public static void main (String[] args)
    {
        String[] Name = {"Edsel" , "Ariel" , "Raphael" , "Ardelia" , "Monique"};
        String[] ID = {"2440081942", "2440100273", "2440071973", "2440065163", "2440061285"};
        String[] Colour = {"Red Velvet" , "Yellow" , "Red", "Black", "Blue"};

        for(int i = 0; i < 5-1; i++)
        {
            for(int j = i+1; j < 5; j++)
            {
                if(Name[i].compareTo(Name[j]) > 0)
                {
                    String NewName = Name[i];
                    String NewID = ID[i];
                    String NewColour = Colour[i];

                    Name[i] = Name[j];
                    ID[i] = ID[j];
                    Colour[i] = Colour[j];

                    Name[j] = NewName;
                    ID[j] = NewID;
                    Colour[j] = NewColour;
                }
            }

        }
        System.out.println("NAME SORT");
        for(int i = 0; i < 5; i++)
        {
            System.out.print(Name[i] + "\t");
            System.out.print(ID[i] + "\t");
            System.out.println(Colour[i]);
        }

        for(int i = 0; i < 5-1; i++ )
        {
            for(int j = i + 1; j < 5; j++)
            {
                if(Colour[i].compareTo(Colour[j]) > 0)
                {
                    String NewName = Name[i];
                    String NewID = ID[i];
                    String NewColour = Colour[i];

                    Name[i] = Name[j];
                    ID[i] = ID[j];
                    Colour[i] = Colour[j];

                    Name[j] = NewName;
                    ID[j] = NewID;
                    Colour[j] = NewColour;

                }

            }

        }
        System.out.println();
        System.out.println("COLOUR SORT");

        for(int i = 0; i < 5; i++)
        {
            System.out.print(Name[i] + "\t");
            System.out.print(ID[i] + "\t");
            System.out.println(Colour[i]);
        }


    }

}
