    public class Humandemo {
        public static void main(String[] args) {
            int i = 10;
            Human h1 = new Human();
            h1.name = "Dhairyasheel";
            h1.age = 20;
            Human h2 = new Human();
            h2.name = "Abhishek";
            h2.age = 30;
            h1.speak("Hello! How r u");
            h2.speak("hey Dhairyasheel i am good.");
        }
    }
        class Human {
            String name;
            int age;
            void speak(String content) {
                System.out.println(name + " : " + content);
            }
        }







