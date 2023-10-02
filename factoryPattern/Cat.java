package factoryPattern2;

public class Cat implements Pet {
    private Integer noOfLives;

    public String makeSound()
    {
        return "Meow, meow!";
    }

    @Override
    public String play() 
    {
        return "Catching/pursuing moving objects!";
    }

    @Override
    public void displayFactoryChange()
    {
        System.out.println("Number of lives: " + noOfLives);
    }

    public Integer getNoOfLives() 
    {
        return noOfLives;
    }

    public void setNoOfLives(Integer noOfLives) 
    {
        this.noOfLives = noOfLives;
    }
}
