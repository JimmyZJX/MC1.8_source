package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import java.io.File;
/*  3:   */ import java.util.Iterator;
/*  4:   */ import java.util.List;
/*  5:   */ import org.apache.logging.log4j.LogManager;
/*  6:   */ import org.apache.logging.log4j.Logger;
/*  7:   */ 
/*  8:   */ public class cey
/*  9:   */ {
/* 10:16 */   private static final Logger a = LogManager.getLogger();
/* 11:   */   private final bsu b;
/* 12:18 */   private final List c = Lists.newArrayList();
/* 13:   */   
/* 14:   */   public cey(bsu parambsu)
/* 15:   */   {
/* 16:21 */     this.b = parambsu;
/* 17:22 */     a();
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void a()
/* 21:   */   {
/* 22:   */     try
/* 23:   */     {
/* 24:27 */       this.c.clear();
/* 25:   */       
/* 26:29 */       NBTTagCompound localfn = fz.a(new File(this.b.v, "servers.dat"));
/* 27:30 */       if (localfn == null) {
/* 28:31 */         return;
/* 29:   */       }
/* 30:34 */       fv localfv = localfn.c("servers", 10);
/* 31:35 */       for (int i = 0; i < localfv.c(); i++) {
/* 32:36 */         this.c.add(cew.a(localfv.b(i)));
/* 33:   */       }
/* 34:   */     }
/* 35:   */     catch (Exception localException)
/* 36:   */     {
/* 37:39 */       a.error("Couldn't load server list", localException);
/* 38:   */     }
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void b()
/* 42:   */   {
/* 43:   */     try
/* 44:   */     {
/* 45:45 */       fv localfv = new fv();
/* 46:46 */       for (Object localObject = this.c.iterator(); ((Iterator)localObject).hasNext();)
/* 47:   */       {
/* 48:46 */         cew localcew = (cew)((Iterator)localObject).next();
/* 49:47 */         localfv.a(localcew.a());
/* 50:   */       }
/* 51:50 */       NBTTagCompound localObject = new NBTTagCompound();
/* 52:51 */       ((NBTTagCompound)localObject).setNBT("servers", localfv);
/* 53:52 */       fz.a((NBTTagCompound)localObject, new File(this.b.v, "servers.dat"));
/* 54:   */     }
/* 55:   */     catch (Exception localException)
/* 56:   */     {
/* 57:54 */       a.error("Couldn't save server list", localException);
/* 58:   */     }
/* 59:   */   }
/* 60:   */   
/* 61:   */   public cew a(int paramInt)
/* 62:   */   {
/* 63:59 */     return (cew)this.c.get(paramInt);
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void b(int paramInt)
/* 67:   */   {
/* 68:63 */     this.c.remove(paramInt);
/* 69:   */   }
/* 70:   */   
/* 71:   */   public void a(cew paramcew)
/* 72:   */   {
/* 73:67 */     this.c.add(paramcew);
/* 74:   */   }
/* 75:   */   
/* 76:   */   public int c()
/* 77:   */   {
/* 78:71 */     return this.c.size();
/* 79:   */   }
/* 80:   */   
/* 81:   */   public void a(int paramInt1, int paramInt2)
/* 82:   */   {
/* 83:75 */     cew localcew = a(paramInt1);
/* 84:76 */     this.c.set(paramInt1, a(paramInt2));
/* 85:77 */     this.c.set(paramInt2, localcew);
/* 86:78 */     b();
/* 87:   */   }
/* 88:   */   
/* 89:   */   public void a(int paramInt, cew paramcew)
/* 90:   */   {
/* 91:82 */     this.c.set(paramInt, paramcew);
/* 92:   */   }
/* 93:   */   
/* 94:   */   public static void b(cew paramcew)
/* 95:   */   {
/* 96:86 */     cey localcey = new cey(bsu.z());
/* 97:87 */     localcey.a();
/* 98:89 */     for (int i = 0; i < localcey.c(); i++)
/* 99:   */     {
/* :0:90 */       cew localcew = localcey.a(i);
/* :1:92 */       if ((localcew.a.equals(paramcew.a)) && (localcew.b.equals(paramcew.b)))
/* :2:   */       {
/* :3:93 */         localcey.a(i, paramcew);
/* :4:94 */         break;
/* :5:   */       }
/* :6:   */     }
/* :7:98 */     localcey.b();
/* :8:   */   }
/* :9:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cey
 * JD-Core Version:    0.7.0.1
 */