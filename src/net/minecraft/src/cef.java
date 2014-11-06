package net.minecraft.src;
/*    1:     */ import com.google.common.util.concurrent.FutureCallback;
/*    2:     */ 
/*    3:     */ class cef
/*    4:     */   implements FutureCallback<Object>
/*    5:     */ {
				  private final String a;
				  private final cee b;
/*    6:     */   cef(cee paramcee, String paramString) {a=paramString;b=paramcee;}
/*    7:     */   
/*    8:     */   public void onSuccess(Object paramObject)
/*    9:     */   {
/*   10:1191 */     cee.a(this.b).a(new mq(this.a, mr.a));
/*   11:     */   }
/*   12:     */   
/*   13:     */   public void onFailure(Throwable paramThrowable)
/*   14:     */   {
/*   15:1196 */     cee.a(this.b).a(new mq(this.a, mr.c));
/*   16:     */   }
/*   17:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cef
 * JD-Core Version:    0.7.0.1
 */