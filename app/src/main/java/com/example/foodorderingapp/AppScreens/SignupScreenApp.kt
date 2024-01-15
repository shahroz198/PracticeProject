package com.example.foodorderingapp.AppScreens

import android.graphics.drawable.Icon
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.foodorderingapp.R
import com.example.foodorderingapp.ui.theme.CustomRed
import com.example.foodorderingapp.ui.theme.backgroundcolor

@RequiresApi(Build.VERSION_CODES.M)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Signupscreen(navControll: NavHostController){
    val inputeusername = remember { mutableStateOf(TextFieldValue()) }
    val inputuseremail = remember { mutableStateOf(TextFieldValue()) }
    val inputuserpass = remember { mutableStateOf(TextFieldValue()) }
  Column(modifier = Modifier
      .verticalScroll(rememberScrollState())
      .fillMaxSize(),
      horizontalAlignment = Alignment
          .CenterHorizontally) {
     Image(painter = painterResource(id = R.drawable
        .foodordering),
        contentDescription = "Food ordering",
         Modifier
             .padding(15.dp)
             .size(250.dp)
             .width(400.dp) )
      // text
      Text(text = "Lets Get Started",
          fontFamily = FontFamily.Serif,
           fontSize = 25.sp,
          fontWeight = FontWeight.Bold
      )
      Text(text = "Create an account",
          fontFamily = FontFamily.Serif,
          fontSize = 18.sp,
          fontWeight = FontWeight.Bold)
     //
      Spacer(modifier = Modifier.height(10.dp))
      Card(modifier = Modifier
          .fillMaxWidth()
          .padding(10.dp),
          shape = RoundedCornerShape(10.dp),
          elevation = CardDefaults.cardElevation(
              defaultElevation = 10.dp
          ),
              colors = CardDefaults.cardColors(
              containerColor = Color.White,
      )) {
                  OutlinedTextField(
                      value =
                      inputeusername.value,
                      onValueChange = {
                          inputeusername.value=it },
                      placeholder = {
                          Text(text =
                          "Enter user name",
                              fontSize = 18.sp
                          ) },
                      modifier = Modifier
                          .padding(all = 20.dp)
                          .fillMaxWidth(),
                      shape = RoundedCornerShape(5.dp),
                      colors = TextFieldDefaults.outlinedTextFieldColors(
                          focusedBorderColor = CustomRed,
                          unfocusedBorderColor = CustomRed),
                      keyboardOptions = KeyboardOptions(
                          capitalization = KeyboardCapitalization.None,
                          autoCorrect = true,
                          keyboardType = KeyboardType.Text,
                      ),
                      // input text style
                      textStyle = TextStyle(color = Color.Black,
                          fontSize = 15.sp,
                          fontFamily = FontFamily.SansSerif
                      ),
                      maxLines = 2,
                      leadingIcon = {
                          // In this method we are specifying
                          // our leading icon and its color.
                          Icon(Icons.Filled.AccountCircle,"face",
                              tint = Color.Red)
                      }
                  )
          //  get Edit text value
          OutlinedTextField(
              value =
              inputuseremail.value,
              onValueChange = {
                  inputuseremail.value=it },
              placeholder = {
                  Text(text =
                  "Enter Email",
                      fontSize = 18.sp) },
              modifier = Modifier
                  .padding(all = 20.dp)
                  .fillMaxWidth()
              ,
              shape = RoundedCornerShape(5.dp),
              colors = TextFieldDefaults.outlinedTextFieldColors(
                  focusedBorderColor = CustomRed,
                  unfocusedBorderColor = CustomRed),

              keyboardOptions = KeyboardOptions(
                  capitalization = KeyboardCapitalization.None,
                  autoCorrect = true,
                  keyboardType = KeyboardType.Text,
              ),
              // input text style
              textStyle = TextStyle(color = Color.Black,
                  fontSize = 15.sp,
                  fontFamily = FontFamily.SansSerif
              ),
              maxLines = 2,
              leadingIcon = {
                  Icon(Icons.Filled.Email,"face",
                      tint = Color.Red)
              }
          )
          //  get Edit text value
          OutlinedTextField(
              value =
              inputuserpass.value,
              onValueChange = {
                  inputuserpass.value=it },
              placeholder = {
                  Text(text =
                  "Enter Password",
                      fontSize = 18.sp) },
              modifier = Modifier
                  .padding(all = 20.dp)
                  .fillMaxWidth()
              ,
              shape = RoundedCornerShape(5.dp),
              colors = TextFieldDefaults.outlinedTextFieldColors(
                  focusedBorderColor = CustomRed,
                  unfocusedBorderColor = CustomRed),

              keyboardOptions = KeyboardOptions(
                  capitalization = KeyboardCapitalization.None,
                  autoCorrect = true,
                  keyboardType = KeyboardType.Text,
              ),
              // input text style
              textStyle = TextStyle(color = Color.Black,
                  fontSize = 15.sp,
                  fontFamily = FontFamily.SansSerif
              ),

              maxLines = 2,
              leadingIcon = {
                  Icon(Icons.Filled.Lock,"face",
                      tint = Color.Red)
              }
          )
      }

    Button(onClick = {
        navControll.navigate("third")
    },
    modifier = Modifier
        .wrapContentWidth()
        .padding(25.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Red,
        contentColor = Color.White)) {
        Text(text = "Create Account",
            fontWeight = FontWeight.Bold
        )
    }
      Row (){
          Text(text = "Already Have An Account?",
              fontSize = 15.sp
          ,fontWeight = FontWeight.Bold)
          Text(text = "Sign IN",
              fontFamily = FontFamily.Serif,
              fontWeight = FontWeight.Bold,
              color= Color.Red,
              fontSize = 15.sp
          )
      }


  }

}

@RequiresApi(Build.VERSION_CODES.M)
@Composable
@Preview(showBackground = true)
fun PreviewSignup(){
}