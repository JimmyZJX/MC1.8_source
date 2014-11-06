package net.minecraft.src;
/*    1:     */ import com.google.common.util.concurrent.FutureCallback;
/*    2:     */ 
/*    3:     */ class cej
/*    4:     */   implements FutureCallback
/*    5:     */ {
				  private final cei a;
/*    6:     */   cej(cei paramcei) {a=paramcei;}
/*    7:     */   
/*    8:     */   public void onSuccess(Object paramObject)
/*    9:     */   {
/*   10:1236 */     cee.a(this.a.a.c).a(new mq(this.a.a.a, mr.a));
/*   11:     */   }
/*   12:     */   
/*   13:     */   public void onFailure(Throwable paramThrowable)
/*   14:     */   {
/*   15:1241 */     cee.a(this.a.a.c).a(new mq(this.a.a.a, mr.c));
/*   16:     */   }
/*   17:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cej
 * JD-Core Version:    0.7.0.1
 */