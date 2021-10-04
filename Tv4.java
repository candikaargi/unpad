public class Tv4 {
    int Channel = 100;
    int Volume = 5;

    // channel up  
    public void channelUp(int newChannel) {
        Channel = newChannel;
    }
    // volume down 
    public void volumeDown(int newVolume) {
        Volume = newVolume; 
    }
    // volume up 
    public void volumeUp(int newVolume) {
        Volume = newVolume;
    }
    // main 
   public static void main(String[] args) {
        Tv4 myTv = new Tv4();

        System.out.println("channel sebelumnya : " + myTv.Channel);
        System.out.println("Volume sebelumnya : " + myTv.Volume);

        myTv.channelUp(115);
        System.out.println("channel dinaikan : " + myTv.Channel);

        myTv.volumeDown(1);
        System.out.println("volume diturunkan : " + myTv.Volume); 

        myTv.volumeUp(3);
        System.out.println("volume dinaikan : " + myTv.Volume);
    } 
    
}
