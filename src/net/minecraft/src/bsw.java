package net.minecraft.src;
/*    1:     */ import java.util.concurrent.Callable;
/*    2:     */ import net.minecraft.client.ClientBrandRetriever;
/*    3:     */ 
/*    4:     */ class bsw
/*    5:     */   implements Callable<String>
/*    6:     */ {
/*    7:     */   bsw(bsu parambsu) {}
/*    8:     */   
/*    9:     */   public String call()
/*   10:     */   {
/*   11:2212 */     String str = ClientBrandRetriever.getClientModName();
/*   12:2213 */     if (!str.equals("vanilla")) {
/*   13:2214 */       return "Definitely; Client brand changed to '" + str + "'";
/*   14:     */     }
/*   15:2216 */     if (bsu.class.getSigners() == null) {
/*   16:2217 */       return "Very likely; Jar signature invalidated";
/*   17:     */     }
/*   18:2219 */     return "Probably not. Jar signature remains and client brand is untouched.";
/*   19:     */   }
/*   20:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bsw
 * JD-Core Version:    0.7.0.1
 */