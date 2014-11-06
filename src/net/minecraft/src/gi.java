package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ class gi
/*   5:    */   extends gh
/*   6:    */ {
/*   7:286 */   protected List<gh> b = Lists.newArrayList();
/*   8:    */   
/*   9:    */   public gi(String paramString)
/*  10:    */   {
/*  11:289 */     this.a = paramString;
/*  12:    */   }
/*  13:    */   
/*  14:    */   public NBTBase a()
/*  15:    */   {
/*  16:294 */     NBTTagCompound localfn = new NBTTagCompound();
/*  17:296 */     for (gh localgh : this.b) {
/*  18:297 */       localfn.setNBT(localgh.a, localgh.a());
/*  19:    */     }
/*  20:300 */     return localfn;
/*  21:    */   }
/*  22:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     gi
 * JD-Core Version:    0.7.0.1
 */