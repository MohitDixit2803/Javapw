// Source code is decompiled from a .class file using FernFlower decompiler.
class launch1 {
   launch1() {
   }

   public static void main(String[] var0) {
      byte var1 = 5;

      for(int var2 = 0; var2 < var1; ++var2) {
         for(int var3 = 0; var3 < var1; ++var3) {
            if (var2 != 0 && var2 != (var1 - 1) / 2 && var3 != 0) {
               System.out.print(" ");
            } else {
               System.out.print("*");
            }
         }

         System.out.println();
      }

   }
}
