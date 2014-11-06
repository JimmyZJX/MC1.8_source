package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.util.Map;
/*  3:   */ import org.apache.logging.log4j.LogManager;
/*  4:   */ import org.apache.logging.log4j.Logger;
/*  5:   */ 
/*  6:   */ public class bmq
/*  7:   */ {
/*  8:18 */   private static final Logger a = LogManager.getLogger();
/*  9:19 */   private static Map b = Maps.newHashMap();
/* 10:20 */   private static Map c = Maps.newHashMap();
/* 11:22 */   private static Map d = Maps.newHashMap();
/* 12:23 */   private static Map e = Maps.newHashMap();
/* 13:   */   
/* 14:   */   private static void b(Class paramClass, String paramString)
/* 15:   */   {
/* 16:26 */     b.put(paramString, paramClass);
/* 17:27 */     c.put(paramClass, paramString);
/* 18:   */   }
/* 19:   */   
/* 20:   */   static void a(Class paramClass, String paramString)
/* 21:   */   {
/* 22:31 */     d.put(paramString, paramClass);
/* 23:32 */     e.put(paramClass, paramString);
/* 24:   */   }
/* 25:   */   
/* 26:   */   static
/* 27:   */   {
/* 28:36 */     b(bjk.class, "Mineshaft");
/* 29:37 */     b(bmx.class, "Village");
/* 30:38 */     b(bjm.class, "Fortress");
/* 31:39 */     b(blq.class, "Stronghold");
/* 32:40 */     b(blh.class, "Temple");
/* 33:41 */     b(bkh.class, "Monument");
/* 34:   */     
/* 35:43 */     bje.a();
/* 36:44 */     bmy.a();
/* 37:45 */     bjn.a();
/* 38:46 */     blr.a();
/* 39:47 */     bli.a();
/* 40:48 */     bki.a();
/* 41:   */   }
/* 42:   */   
/* 43:   */   public static String a(bmv parambmv)
/* 44:   */   {
/* 45:52 */     return (String)c.get(parambmv.getClass());
/* 46:   */   }
/* 47:   */   
/* 48:   */   public static String a(bms parambms)
/* 49:   */   {
/* 50:56 */     return (String)e.get(parambms.getClass());
/* 51:   */   }
/* 52:   */   
/* 53:   */   public static bmv a(NBTTagCompound paramfn, World paramaqu)
/* 54:   */   {
/* 55:61 */     bmv localbmv = null;
/* 56:   */     try
/* 57:   */     {
/* 58:64 */       Class localClass = (Class)b.get(paramfn.getString("id"));
/* 59:65 */       if (localClass != null) {
/* 60:66 */         localbmv = (bmv)localClass.newInstance();
/* 61:   */       }
/* 62:   */     }
/* 63:   */     catch (Exception localException)
/* 64:   */     {
/* 65:69 */       a.warn("Failed Start with id " + paramfn.getString("id"));
/* 66:70 */       localException.printStackTrace();
/* 67:   */     }
/* 68:72 */     if (localbmv != null) {
/* 69:73 */       localbmv.a(paramaqu, paramfn);
/* 70:   */     } else {
/* 71:75 */       a.warn("Skipping Structure with id " + paramfn.getString("id"));
/* 72:   */     }
/* 73:77 */     return localbmv;
/* 74:   */   }
/* 75:   */   
/* 76:   */   public static bms b(NBTTagCompound paramfn, World paramaqu)
/* 77:   */   {
/* 78:81 */     bms localbms = null;
/* 79:   */     try
/* 80:   */     {
/* 81:84 */       Class localClass = (Class)d.get(paramfn.getString("id"));
/* 82:85 */       if (localClass != null) {
/* 83:86 */         localbms = (bms)localClass.newInstance();
/* 84:   */       }
/* 85:   */     }
/* 86:   */     catch (Exception localException)
/* 87:   */     {
/* 88:89 */       a.warn("Failed Piece with id " + paramfn.getString("id"));
/* 89:90 */       localException.printStackTrace();
/* 90:   */     }
/* 91:92 */     if (localbms != null) {
/* 92:93 */       localbms.a(paramaqu, paramfn);
/* 93:   */     } else {
/* 94:95 */       a.warn("Skipping Piece with id " + paramfn.getString("id"));
/* 95:   */     }
/* 96:97 */     return localbms;
/* 97:   */   }
/* 98:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bmq
 * JD-Core Version:    0.7.0.1
 */