package net.minecraft.src;
/*   1:    */ public class aqj
/*   2:    */   extends WeightedRandomItem
/*   3:    */ {
/*   4:    */   private final NBTTagCompound c;
/*   5:    */   private final String d;
/*   6:    */   
/*   7:    */   public aqj(aqi paramaqi, NBTTagCompound paramfn)
/*   8:    */   {
/*   9:302 */     this(paramaqi, paramfn.getCompoundTag("Properties"), paramfn.getString("Type"), paramfn.getInteger("Weight"));
/*  10:    */   }
/*  11:    */   
/*  12:    */   public aqj(aqi paramaqi, NBTTagCompound paramfn, String paramString)
/*  13:    */   {
/*  14:306 */     this(paramaqi, paramfn, paramString, 1);
/*  15:    */   }
/*  16:    */   
/*  17:    */   private aqj(aqi paramaqi, NBTTagCompound paramfn, String paramString, int paramInt)
/*  18:    */   {
/*  19:310 */     super(paramInt);
/*  20:313 */     if (paramString.equals("Minecart")) {
/*  21:314 */       if (paramfn != null) {
/*  22:315 */         paramString = EnumMinecartVariant.a(paramfn.getInteger("Type")).b();
/*  23:    */       } else {
/*  24:317 */         paramString = "MinecartRideable";
/*  25:    */       }
/*  26:    */     }
/*  27:321 */     this.c = paramfn;
/*  28:322 */     this.d = paramString;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public NBTTagCompound a()
/*  32:    */   {
/*  33:326 */     NBTTagCompound localfn = new NBTTagCompound();
/*  34:    */     
/*  35:328 */     localfn.setNBT("Properties", this.c);
/*  36:329 */     localfn.setString("Type", this.d);
/*  37:330 */     localfn.setInt("Weight", this.weight);
/*  38:    */     
/*  39:332 */     return localfn;
/*  40:    */   }
				static String a(aqj arg0) {return arg0.d;}
				static NBTTagCompound b(aqj arg0) {return arg0.c;}
/*  41:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aqj
 * JD-Core Version:    0.7.0.1
 */