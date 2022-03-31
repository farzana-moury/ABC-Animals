package Classes;

import javafx.scene.image.Image;
import java.io.File;

/** Animal Class that contains the data required for represenation of each animal in the alphabet
 * @author Farzana Moury, Omar Yousef, Yousif Fadi
 */

public class Animal{
    //fields/properties
    private File letterSound, animalSound, wordSound;
    private Image animalImage;//

    /** Animal Class that contains the data required for represenation of each animal in the alphabet
     * Instantiates image of the animal as well as respective sounds
     * @author Farzana Moury, Omar Yousef, Yousif Fadi
     * @param animalImage the image of the animal
     * @param letterSound sound representing starting letter of animal ex) 'Z' for Zebra
     * @param animalSound sound representing verbal sound of animal ex) 'quack' for Duck
     * @param wordSound sound representing word sound of the animal ex) 'alligator' for Alligator
     */
    public Animal(Image animalImage, File letterSound, File animalSound, File wordSound) {
        this.animalImage = animalImage;
        this.letterSound = letterSound;
        this.animalSound = animalSound;
        this.wordSound = wordSound;
    }

    /**
     * Gets the animal's image
     * @return an Image representing the animal
     */
    public Image getAnimalImage() {
        return animalImage;
    }

    /**
     * Sets the animal's image
     * @param animalImage an Image containing the animal's image
     */
    public void setAnimalImage(Image animalImage) {
        this.animalImage = animalImage;
    }

    /**
     * Gets the animal's letter sound
     * @return a File representing the animal's letter sound
     */
    public File getLetterSound() {
        return letterSound;
    }

    /**
     * Sets the animal's letter sound
     * @param letterSound a File containing the animal's letter sound
     */
    public void setLetterSound(File letterSound) {
        this.letterSound = letterSound;
    }

    /**
     * Gets the animal's verbal sound
     * @return a File representing the animal's verbal sound
     */
    public File getAnimalSound() {
        return animalSound;
    }

    /**
     * Sets the animal's verbal sound
     * @param animalSound a File containing the animal's verbal sound
     */
    public void setAnimalSound(File animalSound) {
        this.animalSound = animalSound;
    }

    /**
     * Gets the animal's word sound
     * @return a File representing the animal's word sound
     */
    public File getWordSound() {
        return wordSound;
    }

    /**
     * Sets the animal's word sound
     * @param wordSound a File containing the animal's word sound
     */
    public void setWordSound(File wordSound) {
        this.wordSound = wordSound;
    }
}
