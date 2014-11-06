package net.minecraft.src;
/*   1:    */ public enum cls
/*   2:    */ { a(EnumDirection.DOWN,false),b(EnumDirection.UP,false),c(EnumDirection.NORTH,false),d(EnumDirection.SOUTH,false),e(EnumDirection.WEST,false),f(EnumDirection.EAST,false),
				g(EnumDirection.DOWN,true),h(EnumDirection.UP,true),i(EnumDirection.NORTH,true),j(EnumDirection.SOUTH,true),k(EnumDirection.WEST,true),l(EnumDirection.EAST,true);
/*   3:    */   protected final int m;
/*   4:    */   
/*   5:    */   private cls(EnumDirection paramej, boolean paramBoolean)
/*   6:    */   {
/*   7:524 */     this.m = (paramej.a() + (paramBoolean ? EnumDirection.values().length : 0));
/*   8:    */   }
/*   9:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cls
 * JD-Core Version:    0.7.0.1
 */