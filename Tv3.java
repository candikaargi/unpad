public class Tv3 {
   int channel = 40;
   int volume = 4;
   
   // volumeDown 
   public void channelDown(int newChannel) {
       channel = newChannel;
   }

   // volumeUp 
   public void volumeUp(int newVolume) {
       volume = newVolume;
   }
   // main 
   public static void main (String[] args) {
       Tv3 myTv = new Tv3();

       System.out.println("channel sebelumnya : " + myTv.channel);
       System.out.println("Volume sebelumnya : " + myTv.volume);

       myTv.channelDown(35);
       System.out.println("Channel saat ini : " + myTv.channel);

       myTv.volumeUp(6);
       System.out.println("Volume saat ini : " + myTv.volume);
   }

} 