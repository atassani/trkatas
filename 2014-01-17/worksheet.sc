import scala.collection.immutable.ListMap
import com.sun.org.apache.xalan.internal.xsltc.compiler.ForEach

object worksheet {
                             
   def convert(num:Int):String = {
     val numbers = ListMap(1000->"M", 900->"CM", 500->"D", 400-> "CD", 100-> "C", 90-> "XC",	50-> "L", 40-> "XL", 10-> "X", 9-> "IX", 5-> "V", 4-> "IV", 1-> "I")
   	 var tmp_num = num
   	 var res = ""
   	 
   	 for ((key,roman) <- numbers) {
   	 		while (tmp_num >= key){
   	 			res = res + roman
   	 			tmp_num = tmp_num - key
   	 			}
   	 }
   	 res
   }                                              //> convert: (num: Int)String
   
   "a" + "b"                                      //> res0: String("ab") = ab
   
   
   convert(1)                                     //> res1: String = I
   convert(2)                                     //> res2: String = II
   convert(3)                                     //> res3: String = III
   convert(4)                                     //> res4: String = IV
   convert(39)                                    //> res5: String = XXXIX
   convert(51)                                    //> res6: String = LI
   convert(2999)                                  //> res7: String = MMCMXCIX
   
}