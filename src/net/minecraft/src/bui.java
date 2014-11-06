package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import java.util.ArrayList;
/*  3:   */ import java.util.List;
/*  4:   */ 
/*  5:   */ public class bui
/*  6:   */ {
/*  7:   */   public static String a(String paramString, boolean paramBoolean)
/*  8:   */   {
/*  9:14 */     if ((paramBoolean) || (bsu.z().t.m)) {
/* 10:15 */       return paramString;
/* 11:   */     }
/* 12:17 */     return a.a(paramString);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public static List<ho> a(ho paramho, int paramInt, bty parambty, boolean paramBoolean1, boolean paramBoolean2)
/* 16:   */   {
/* 17:22 */     int i = 0;
/* 18:23 */     hy localhy1 = new hy("");
/* 19:24 */     ArrayList<ho> localArrayList1 = Lists.newArrayList();
/* 20:25 */     ArrayList<ho> localArrayList2 = Lists.newArrayList(paramho);
/* 21:27 */     for (int j = 0; j < localArrayList2.size(); j++)
/* 22:   */     {
/* 23:28 */       ho localho = (ho)localArrayList2.get(j);
/* 24:29 */       String str1 = localho.e();
/* 25:30 */       int k = 0;
/* 26:31 */       if (str1.contains("\n"))
/* 27:   */       {
/* 28:32 */         int m = str1.indexOf('\n');
/* 29:33 */         String localObject2 = str1.substring(m + 1);
/* 30:34 */         str1 = str1.substring(0, m + 1);
/* 31:35 */         hy localhy2 = new hy((String)localObject2);
/* 32:36 */         localhy2.a(localho.b().m());
/* 33:37 */         localArrayList2.add(j + 1, localhy2);
/* 34:38 */         k = 1;
/* 35:   */       }
/* 36:40 */       Object localObject1 = a(localho.b().k() + str1, paramBoolean2);
/* 37:41 */       Object localObject2 = ((String)localObject1).endsWith("\n") ? ((String)localObject1).substring(0, ((String)localObject1).length() - 1) : localObject1;
/* 38:42 */       int n = parambty.a((String)localObject2);
/* 39:43 */       hy localhy3 = new hy((String)localObject2);
/* 40:44 */       localhy3.a(localho.b().m());
/* 41:46 */       if (i + n > paramInt)
/* 42:   */       {
/* 43:47 */         String str2 = parambty.a((String)localObject1, paramInt - i, false);
/* 44:48 */         Object localObject3 = str2.length() < ((String)localObject1).length() ? ((String)localObject1).substring(str2.length()) : null;
/* 45:50 */         if ((localObject3 != null) && (((String)localObject3).length() > 0))
/* 46:   */         {
/* 47:51 */           int i1 = str2.lastIndexOf(" ");
/* 48:52 */           if ((i1 >= 0) && (parambty.a(((String)localObject1).substring(0, i1)) > 0))
/* 49:   */           {
/* 50:53 */             str2 = ((String)localObject1).substring(0, i1);
/* 51:54 */             if (paramBoolean1) {
/* 52:55 */               i1++;
/* 53:   */             }
/* 54:57 */             localObject3 = ((String)localObject1).substring(i1);
/* 55:   */           }
/* 56:58 */           else if ((i > 0) && (!((String)localObject1).contains(" ")))
/* 57:   */           {
/* 58:59 */             str2 = "";
/* 59:60 */             localObject3 = localObject1;
/* 60:   */           }
/* 61:63 */           hy localhy4 = new hy((String)localObject3);
/* 62:64 */           localhy4.a(localho.b().m());
/* 63:65 */           localArrayList2.add(j + 1, localhy4);
/* 64:   */         }
/* 65:68 */         localObject1 = str2;
/* 66:69 */         n = parambty.a((String)localObject1);
/* 67:70 */         localhy3 = new hy((String)localObject1);
/* 68:71 */         localhy3.a(localho.b().m());
/* 69:72 */         k = 1;
/* 70:   */       }
/* 71:75 */       if (i + n <= paramInt)
/* 72:   */       {
/* 73:76 */         i += n;
/* 74:   */         
/* 75:78 */         localhy1.a(localhy3);
/* 76:   */       }
/* 77:   */       else
/* 78:   */       {
/* 79:80 */         k = 1;
/* 80:   */       }
/* 81:83 */       if (k != 0)
/* 82:   */       {
/* 83:84 */         localArrayList1.add(localhy1);
/* 84:85 */         i = 0;
/* 85:86 */         localhy1 = new hy("");
/* 86:   */       }
/* 87:   */     }
/* 88:90 */     localArrayList1.add(localhy1);
/* 89:91 */     return localArrayList1;
/* 90:   */   }
/* 91:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bui
 * JD-Core Version:    0.7.0.1
 */