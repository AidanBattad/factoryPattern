package factoryPattern2;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("Choose your pet number: ");
            choice = input.nextInt();

            switch (choice)
            {
                case 1:
                    DogInfo();
                    break;
                case 2:
                    CatInfo();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }
    private static void DogInfo()
    {
        PetRecord petFile = new PetRecord();
        Pet pet = new Dog();
        petFile.setPetId("D01");
        petFile.setPetName("Bantay");
        petFile.setPet(pet);
        ((Dog) pet).setBreed("German Shepperd");

        PetInfo(petFile);
    }

    private static void CatInfo()
    {
        PetRecord petFile = new PetRecord();
        Pet pet = new Cat();
        petFile.setPetId("C01");
        petFile.setPetName("Muning");
        petFile.setPet(pet);
        ((Cat) pet).setNoOfLives(9);

        PetInfo(petFile);
    }

    private static void PetInfo(PetRecord petRecord)
    {
        petRecord.getPet().displayFactoryChange();
        System.out.println();
        System.out.println("Pet id is " + petRecord.getPetId());
        System.out.println("Pet name is " + petRecord.getPetName());
        System.out.println("Pet kind: " + petRecord.getPet().getClass().getSimpleName());
        System.out.println("Communication sound: " + petRecord.getPet().makeSound());
        System.out.println("Play mode: " + petRecord.getPet().play());
        
        
    }
}
