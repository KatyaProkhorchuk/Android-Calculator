package com.example.calculator

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var mE1: EditText? = null
    public var op:String="";
    public var a:String="";
    public var b:String="";
    public var number:String="";
    public var result:String="";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        this.mE1= findViewById<EditText>(android.R.id.EditText);
    }
    public fun solve(){
        val textView = findViewById<TextView>(R.id.editText);
        val textRes = findViewById<TextView>(R.id.textRes);

        var str: String = textView.text.toString()
        if(a!=""&&b!="") {
            val res_a = a.toDouble()
            val res_b = b.toDouble();
            var res=0.0
            if(op=="+") {
                res = res_a + res_b
            }else if(op=="-"){
                res = res_a - res_b

            }
            else if(op=="*"){
                res = res_a * res_b

            }
            else if(op=="/"){
                if(b!="0")
                    res = res_a / res_b
                else{
                    result="Error"
                }
            }
            println(res)
            println(a.toInt())
            if(result!="Error")
                if((res.toInt().toString()+".0")==res.toString()){
                    result=res.toInt().toString()
                }
                else
                    result=res.toString()
            textRes.setText(result);
            str=str+"+";
            op="+"
            b=""
            a=""
            number=""

        }
        else if(result!=""&&b!=""){
            val res_b = b.toDouble();
            val res_res=result.toDouble()
            println(res_b)
            var res=0.0
            if(op=="+") {
                res = res_res + res_b
            }else if(op=="-"){
                res = res_res - res_b

            }
            else if(op=="*"){
                res = res_res * res_b

            }
            else if(op=="/"){
                if(b!="0")
                    res = res_res / res_b
                else{
                    result="Error"
                }
            }
            println(res)
            if(result!="Error")
                if((res.toInt().toString()+".0")==res.toString()){
                    result=res.toInt().toString()
                }
                else
                    result=res.toString()
            textRes.setText(result);
            str=str+"+";
            op="+"
            number=""

            b=""
            a=""

        }
        textView.setText(str);
    }
    public fun onCalculate(view: View?){
//        val edit = findViewById(android.R.id.editTextSource) as EditText
//        val mE1= findViewById<EditText>(android.R.id.EditText);
//        val edit = findViewById<EditText>(android.R.id.EditText)
        val textView = findViewById<TextView>(R.id.editText);
        val textRes = findViewById<TextView>(R.id.textRes);

        println(textView.getText())
//        val editone = findViewById(android.R.id.editText) as EditText
//        if (view != null) {
//            print(view.getId())
//        }
//        print("hi$editText")
        if (view != null) {

            if(view.getId()==R.id.buttonC){
                println(view.getId())
                val str: String = textView.text.toString()
                println(str)
                textView.setText("0");
                textRes.setText("0");
                result=""
                op=""
                a=""
                b=""
            }
            if(view.getId()==R.id.button_0){
                println(view.getId());
                var str: String = textView.text.toString()
                if(str=="Error"){
                    str="0"
                }
                if(str!="0"){
                    str=str+"0";
                    number+="0"
                }
                if(op==""){
                    a=number;
                }
                else b=number;
                textView.setText(str);
//                textRes.setText("0");

            }
            if(view.getId()==R.id.button_1){
                println(view.getId());
                var str: String = textView.text.toString()
                if(str=="Error"){
                    str="0"
                }
                if(str!="0"){
                    str=str+"1";
                    number+="1"                }
                else{
                    str="1"
                    number="1"
                }
                if(op==""){
                    a=number;
                }
                else b=number;
                textView.setText(str);
            }
            if(view.getId()==R.id.button_2){
                println(view.getId());
                var str: String = textView.text.toString()
                if(str=="Error"){
                    str="0"
                }
                if(str!="0"){
                    str=str+"2";
                    number+="2"
                }
                else{
                    str="2"
                    number="2"
                }
                if(op==""){
                    a=number;
                }
                else b=number;
                textView.setText(str);
            }
            if(view.getId()==R.id.button_3){
                println(view.getId());
                var str: String = textView.text.toString()
                if(str=="Error"){
                    str="0"
                }
                if(str!="0"){
                    str=str+"3";
                    number+="3"
                }
                else{
                    str="3"
                    number="3"
                }
                if(op==""){
                    a=number;
                }
                else b=number;
                textView.setText(str);
            }
            if(view.getId()==R.id.button_4){
                println(view.getId());
                var str: String = textView.text.toString()
                if(str=="Error"){
                    str="0"
                }
                if(str!="0"){
                    str=str+"4";
                    number+="4"
                }
                else{
                    str="4"
                    number="4"
                }
                if(op==""){
                    a=number;
                }
                else b=number;
                textView.setText(str);
            }
            if(view.getId()==R.id.button_5){
                println(view.getId());
                var str: String = textView.text.toString()
                if(str=="Error"){
                    str="0"
                }
                if(str!="0"){
                    str=str+"5";
                    number+="5"
                }
                else{
                    str="5"
                    number="5"
                }
                if(op==""){
                    a=number;
                }
                else b=number;
                textView.setText(str);
            }
            if(view.getId()==R.id.button_6){
                println(view.getId());
                var str: String = textView.text.toString()
                if(str=="Error"){
                    str="0"
                }
                if(str!="0"){
                    str=str+"6";
                    number+="6"
                }
                else{
                    str="6"
                    number="6"
                }
                if(op==""){
                    a=number;
                }
                else b=number;
                textView.setText(str);
            }
            if(view.getId()==R.id.button_7){
                println(view.getId());
                var str: String = textView.text.toString()
                if(str=="Error"){
                    str="0"
                }
                if(str!="0"){
                    str=str+"7";
                    number+="7"
                }
                else{
                    str="7"
                    number="7"
                }
                if(op==""){
                    a=number;
                }
                else b=number;
                textView.setText(str);
            }
            if(view.getId()==R.id.button_8){
                println(view.getId());
                var str: String = textView.text.toString()
                if(str=="Error"){
                    str="0"
                }
                if(str!="0"){
                    str=str+"8";
                    number+="8"
                }
                else{
                    str="8"
                    number="8"
                }
                if(op==""){
                    a=number;
                }
                else b=number;
                textView.setText(str);
            }
            if(view.getId()==R.id.button_9){
                println(view.getId());
                var str: String = textView.text.toString()
                if(str=="Error"){
                    str="0"
                }
                if(str!="0"){
                    str=str+"9";
                    number+="9"
                }
                else{
                    str="9"
                    number+="9"
                }
                if(op==""){
                    a=number;
                }
                else b=number;
                textView.setText(str);
            }
            if(view.getId()==R.id.button_plus){
                println(view.getId());
                var str: String = textView.text.toString()

                if(str!="0"){
                    if(op=="")
                        str=str+"+";
                }

                println(op)
                println(str)
                if(op==""){
                    op="+"
                    number=""
                }
                else{
//                    solve();
                    if(a!=""&&b!="") {
                        val res_a = a.toDouble()
                        val res_b = b.toDouble();
                        var res=0.0
                        if(op=="+") {
                            res = res_a + res_b
                        }else if(op=="-"){
                            res = res_a - res_b

                        }
                        else if(op=="*"){
                            res = res_a * res_b

                        }
                        else if(op=="/"){
                            if(b!="0")
                                res = res_a / res_b
                            else{
                                result="Error"
                            }
                        }
                        println(res)
                        println(a.toInt())
                        if(result!="Error")
                        if((res.toInt().toString()+".0")==res.toString()){
                            result=res.toInt().toString()
                        }
                        else
                            result=res.toString()
                        textRes.setText(result);
                        str=str+"+";
                        op="+"
                        b=""
                        a=""
                        number=""

                    }
                    else if(result!=""&&b!=""){
                        val res_b = b.toDouble();
                        val res_res=result.toDouble()
                        println(res_b)
                        var res=0.0
                        if(op=="+") {
                            res = res_res + res_b
                        }else if(op=="-"){
                            res = res_res - res_b

                        }
                        else if(op=="*"){
                            res = res_res * res_b

                        }
                        else if(op=="/"){
                            if(b!="0")
                            res = res_res / res_b
                            else{
                                result="Error"
                            }
                        }
                        println(res)
                        if(result!="Error")
                        if((res.toInt().toString()+".0")==res.toString()){
                            result=res.toInt().toString()
                        }
                        else
                            result=res.toString()
                        textRes.setText(result);
                        str=str+"+";
                        op="+"
                        number=""

                        b=""
                        a=""
                    }
                }

                textView.setText(str);
            }
            if(view.getId()==R.id.button_minus){
                println(view.getId());
                var str: String = textView.text.toString()

                if(str!="0"){
                    if(op=="")
                        str=str+"-";
                }
                println(op)
                println(str)
                if(op==""){
                    op="-"
                    number=""
                }
                else{
                    if(a!=""&&b!="") {
                        val res_a = a.toDouble()
                        val res_b = b.toDouble();
                        var res=0.0
                        if(op=="+") {
                            res = res_a + res_b
                        }else if(op=="-"){
                            res = res_a - res_b

                        }
                        else if(op=="*"){
                            res = res_a * res_b

                        }
                        else if(op=="/"){
                            if(b!="0")
                                res = res_a / res_b
                            else{
                                result="Error"
                            }
                        }
                        println(res)
                        println(a.toInt())
                        if(result!="Error")
                            if((res.toInt().toString()+".0")==res.toString()){
                            result=res.toInt().toString()
                        }
                        else
                            result=res.toString()
                        textRes.setText(result);
                        str=str+"-";
                        op="-"
                        b=""
                        a=""
                        number=""

                    }
                    else if(result!=""&&b!=""){
                        val res_b = b.toDouble();
                        val res_res=result.toDouble()
                        println(res_b)
                        var res=0.0
                        if(op=="+") {
                            res = res_res + res_b
                        }else if(op=="-"){
                            res = res_res - res_b

                        }
                        else if(op=="*"){
                            res = res_res * res_b

                        }
                        else if(op=="/"){
                            if(b!="0")
                                res = res_res / res_b
                            else{
                                result="Error"
                            }
                        }
//                        val res = res_res * res_b
                        println(res)
                        if(result!="Error")
                            if((res.toInt().toString()+".0")==res.toString()){
                            result=res.toInt().toString()
                        }
                        else
                            result=res.toString()
                        textRes.setText(result);
                        str=str+"-";
                        op="-"
                        number=""

                        b=""
                        a=""
                    }
                }

                textView.setText(str);
            }
            if(view.getId()==R.id.button_mul){
                println(view.getId());
                var str: String = textView.text.toString()

                if(str!="0"){
                    if(op=="")
                        str=str+"*";
                }
                println(op)
                println(str)
                if(op==""){
                    op="*"
                    number=""
                }
                else{
                    if(a!=""&&b!="") {
                        val res_a = a.toDouble()
                        val res_b = b.toDouble();
                        var res=0.0
                        if(op=="+") {
                            res = res_a + res_b
                        }else if(op=="-"){
                            res = res_a - res_b

                        }
                        else if(op=="*"){
                            res = res_a * res_b

                        }
                        else if(op=="/"){
                            if(b!="0")
                                res = res_a / res_b
                            else{
                                result="Error"
                            }
                        }
                        println(res)
                        println(a.toInt())
                        if(result!="Error")
                            if((res.toInt().toString()+".0")==res.toString()){
                            result=res.toInt().toString()
                        }
                        else
                            result=res.toString()
                        textRes.setText(result);
                        str=str+"*";
                        op="*"
                        b=""
                        a=""
                        number=""

                    }
                    else if(result!=""&&b!=""){
                        val res_b = b.toDouble();
                        val res_res=result.toDouble()
                        println(res_b)
                        var res=0.0
                        if(op=="+") {
                            res = res_res + res_b
                        }else if(op=="-"){
                            res = res_res - res_b

                        }
                        else if(op=="*"){
                            res = res_res * res_b

                        }
                        else if(op=="/"){
                            if(b!="0")
                                res = res_res / res_b
                            else{
                                result="Error"
                            }
                        }
                        println(res)
                        if(result!="Error")
                            if((res.toInt().toString()+".0")==res.toString()){
                            result=res.toInt().toString()
                        }
                        else
                            result=res.toString()
                        textRes.setText(result);
                        str=str+"*";
                        op="*"
                        number=""

                        b=""
                        a=""
                    }
                }

                textView.setText(str);
            }
            if(view.getId()==R.id.button_div){
                println(view.getId());
                var str: String = textView.text.toString()

                if(str!="0"){
                    if(op=="")
                        str=str+"/";
                }
                println(op)
                println(str)
                if(op==""){
                    op="/"
                    number=""
                }
                else{
                    if(a!=""&&b!="") {
                        val res_a = a.toDouble()
                        val res_b = b.toDouble();
                        var res=0.0
                        if(op=="+") {
                            res = res_a + res_b
                        }else if(op=="-"){
                            res = res_a - res_b

                        }
                        else if(op=="*"){
                            res = res_a * res_b

                        }
                        else if(op=="/"){
                            if(b!="0")
                                res = res_a / res_b
                            else{
                                result="Error"
                            }
                        }
                        println(res)
                        println(a.toDouble())
                        if(result!="Error")
                            if((res.toInt().toString()+".0")==res.toString()){
                            result=res.toInt().toString()
                        }
                        else
                            result=res.toString()
                        textRes.setText(result);
                        str=str+"/";
                        op="/"
                        b=""
                        a=""
                        number=""

                    }
                    else if(result!=""&&b!=""){
                        val res_b = b.toDouble();
                        val res_res=result.toDouble()
                        println(res_b)
                        var res=0.0
                        if(op=="+") {
                            res = res_res + res_b
                        }else if(op=="-"){
                            res = res_res - res_b

                        }
                        else if(op=="*"){
                            res = res_res * res_b

                        }
                        else if(op=="/"){
                            if(b!="0")
                                res = res_res / res_b
                            else{
                                result="Error"
                            }
                        }
                        println(res)
                        if(result!="Error")
                            if((res.toInt().toString()+".0")==res.toString()){
                            result=res.toInt().toString()
                        }
                        else
                            result=res.toString()
                        textRes.setText(result);
                        str=str+"/";
                        op="/"
                        number=""

                        b=""
                        a=""
                    }
                }

                textView.setText(str);
            }
            if(view.getId()==R.id.button_answer){
//                println(view.getId());
                println("a="+a)
                println("b="+b)

                var str: String = textView.text.toString()
                if(b=="") {
                    a = result
                    b = ""
                    op = ""
                    textView.setText(result);
                }
                else{
                    if(a!=""&&b!="") {
                        val res_a = a.toDouble()
                        val res_b = b.toDouble();
                        var res=0.0
                        if(op=="+") {
                            res = res_a + res_b
                        }else if(op=="-"){
                            res = res_a - res_b

                        }
                        else if(op=="*"){
                            res = res_a * res_b

                        }
                        else if(op=="/"){
                            if(b!="0") {
                                res = res_a / res_b
                                println("b not null")
                            }
                            else{
                                result="Error"
                            }
                        }
                        println(res)
                        println(a.toInt())
                        if(result!="Error")
                        if((res.toInt().toString()+".0")==res.toString()){
                            result=res.toInt().toString()
                        }
                        else result=res.toString()
                        textRes.setText(result);
                        b=""
                        a=""
                        number=""

                    }
                    else if(result!=""&&b!=""){
                        val res_b = b.toDouble();
                        val res_res=result.toDouble()
                        println(res_b)
                        var res=0.0
                        if(op=="+") {
                            res = res_res + res_b
                        }else if(op=="-"){
                            res = res_res - res_b

                        }
                        else if(op=="*"){
                            res = res_res * res_b

                        }
                        else if(op=="/"){
                            if(b!="0")
                                res = res_res / res_b
                            else{
                                result="Error"
                            }
                        }
                        println(res)
                        if(result!="Error")
                        if((res.toInt().toString()+".0")==res.toString()){
                            result=res.toInt().toString()
                        }
                        else
                            result=res.toString()
                        textRes.setText(result);
                        number=""

                        b=""
                        a=""
                    }
                    a = result
                    number=result
                    b = ""
                    op = ""
                    textView.setText(result);
                }


//                if(str!="0"){
//                    str=str+"+";
//                }
//                else{
//                    str="+"
//                }
//                textView.setText(str);
            }
            if(view.getId()==R.id.button_per){
//                    if(op==""){
//                        println("9")
////                        res
//                    }
                var str: String = textView.text.toString()

                str+="%"
                textView.setText(str);

                if(b==""&&a!=""){
                    a=(a.toDouble()/100.0).toString()
                    println("a="+a)
                }
                else{
                    b=(b.toDouble()/100.0).toString()
                    println("b="+b)
                }
            }
        }
    }
}