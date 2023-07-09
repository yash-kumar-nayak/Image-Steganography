# Image-Steganography
-----------
defination:
-----------
Steganography is the practice of concealing or hiding information within other non-secret data, such as text, images, audio files, or video files, in a way that the presence of the hidden information is not easily detectable. The goal of steganography is to hide the fact that communication or secret information is taking place, as opposed to cryptography, which focuses on making the content of a message unintelligible to unauthorized individuals.
----------------------------------------------
types of Image-Steganography used in java code
----------------------------------------------
In LSB steganography, the least significant bit of each pixel's color value is modified to encode the hidden data. Since the least significant bit has the least impact on the overall color value, modifying it slightly does not significantly alter the appearance of the image to the human eye.

1) embeddedMessage: This method is the main entry point that takes an image (BufferedImage) and a message (String) as input. It first checks if the length of the message, when converted to bits, along with the additional 32 bits for storing the message length, exceeds the number of pixels in the image. If it does, an error message is displayed. Otherwise, the message is embedded in the image by calling other helper methods.

2) embedInteger: This method embeds an integer (n) into the image starting from a specified position (start). It converts the integer into bits and embeds each bit in the LSB of the RGB values of the pixels in the image. The storageBit parameter determines which color component (R, G, or B) will be used for embedding.


3) embedByte: This method is similar to embedInteger but works with a single byte (b) instead of an integer. It embeds each bit of the byte in the LSB of the RGB values of the pixels.                
                                                                                                                                                                    
 5) getBitValue: This method retrieves the value (0 or 1) of a specific bit (location) within an integer (n).


 6) setBitValue: This method sets the value of a specific bit (location) within an integer (n) to a given bit (bit). It uses bitwise operations to toggle or modify the bit value.
![Screenshot (56)](https://github.com/yash-kumar-nayak/Image-Steganography/assets/114598638/b1b39b83-d484-45b9-a69c-3cc0c0d33989)
![Screenshot (58)](https://github.com/yash-kumar-nayak/Image-Steganography/assets/114598638/1b339d9a-194d-4032-82b4-bb389c40d999)
![Screenshot (59)](https://github.com/yash-kumar-nayak/Image-Steganography/assets/114598638/6ff1b9c6-f1be-431a-b9bf-8351ae1fbfbc)
![Screenshot (60)](https://github.com/yash-kumar-nayak/Image-Steganography/assets/114598638/7e2d1265-715d-4229-aa4e-c08573125667)
![Screenshot (61)](https://github.com/yash-kumar-nayak/Image-Steganography/assets/114598638/a4d9dd9c-e142-4d36-90e8-a3cdc16e4529)
