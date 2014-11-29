package net.minecraft.src;
/*   1:    */ public class EntityDataEntry
/*   2:    */ {
/*   3:    */   private final int id;
/*   4:    */   private final int typeID;
/*   5:    */   private Object value;
/*   6:    */   private boolean d;
/*   7:    */   
/*   8:    */   public EntityDataEntry(int id, int typeID, Object value)
/*   9:    */   {
/*  10:352 */     this.typeID = typeID;
/*  11:353 */     this.value = value;
/*  12:354 */     this.id = id;
/*  13:355 */     this.d = true;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public int getType()
/*  17:    */   {
/*  18:359 */     return this.typeID;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public void setValue(Object v)
/*  22:    */   {
/*  23:363 */     this.value = v;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public Object getValue()
/*  27:    */   {
/*  28:367 */     return this.value;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public int getID()
/*  32:    */   {
/*  33:371 */     return this.id;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public boolean d()
/*  37:    */   {
/*  38:375 */     return this.d;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void a(boolean paramBoolean)
/*  42:    */   {
/*  43:379 */     this.d = paramBoolean;
/*  44:    */   }
				static boolean a(EntityDataEntry arg0, boolean arg1) {return arg0.d=arg1;}
/*  45:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     xw
 * JD-Core Version:    0.7.0.1
 */