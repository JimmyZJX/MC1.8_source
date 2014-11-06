package net.minecraft.src;
/*    1:     */ import java.util.concurrent.Callable;
/*    2:     */ 
/*    3:     */ class EntityVehicleGetter
/*    4:     */   implements Callable<String>
/*    5:     */ {
				  private final Entity a;
/*    6:     */   EntityVehicleGetter(Entity paramwv) {a=paramwv;}
/*    7:     */   
/*    8:     */   public String call()
/*    9:     */   {
/*   10:1807 */     return this.a.vehicle.toString();
/*   11:     */   }
/*   12:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     wz
 * JD-Core Version:    0.7.0.1
 */