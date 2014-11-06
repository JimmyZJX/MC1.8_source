package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ class gj
/*   5:    */   extends gh
/*   6:    */ {
/*   7:305 */   protected List<gh> b = Lists.newArrayList();
/*   8:    */   
/*   9:    */   public gj(String paramString)
/*  10:    */   {
/*  11:308 */     this.a = paramString;
/*  12:    */   }
/*  13:    */   
/*  14:    */   public NBTBase a()
/*  15:    */   {
/*  16:313 */     fv localfv = new fv();
/*  17:315 */     for (gh localgh : this.b) {
/*  18:316 */       localfv.a(localgh.a());
/*  19:    */     }
/*  20:319 */     return localfv;
/*  21:    */   }
/*  22:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     gj
 * JD-Core Version:    0.7.0.1
 */