package net.minecraft.src;
/*    1:     */ import com.google.common.util.concurrent.Futures;
/*    2:     */ 
/*    3:     */ class cei
/*    4:     */   implements bvz
/*    5:     */ {
				  final ceh a;
/*    6:     */   cei(ceh paramceh) {a=paramceh;}
/*    7:     */   
/*    8:     */   public void a(boolean paramBoolean, int paramInt)
/*    9:     */   {
/*   10:1225 */     cee.a(this.a.c, bsu.z());
/*   11:1227 */     if (paramBoolean)
/*   12:     */     {
/*   13:1228 */       if (cee.b(this.a.c).C() != null) {
/*   14:1229 */         cee.b(this.a.c).C().a(cex.a);
/*   15:     */       }
/*   16:1232 */       cee.a(this.a.c).a(new mq(this.a.a, mr.d));
/*   17:1233 */       Futures.addCallback(cee.b(this.a.c).P().a(this.a.b, this.a.a), new cej(this));
/*   18:     */     }
/*   19:     */     else
/*   20:     */     {
/*   21:1245 */       if (cee.b(this.a.c).C() != null) {
/*   22:1246 */         cee.b(this.a.c).C().a(cex.b);
/*   23:     */       }
/*   24:1249 */       cee.a(this.a.c).a(new mq(this.a.a, mr.b));
/*   25:     */     }
/*   26:1251 */     cey.b(cee.b(this.a.c).C());
/*   27:     */     
/*   28:1253 */     cee.b(this.a.c).a((bxf)null);
/*   29:     */   }
/*   30:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cei
 * JD-Core Version:    0.7.0.1
 */