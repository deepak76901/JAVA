package Patterns;
public class Pattern2 {
    public static void main(String[] args) {

        // TRAINGLE PATTERN

        // int n=11;
        // for(int i=0;i<n;i++){
        // for(int j=0;j<n;j++ ){
        // if (i==n-1 || i+j==(n-1) && i>=(n-1)/2 || i==j && j>=(n-1)/2 ){
        // System.out.print("*");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }System.out.println();
        // }

        // PATTERN OF HUT

        // int n=11;
        // for(int i=0;i<n;i++){
        // for(int j=0;j<n;j++ ){
        // if (i==n-1 || i==0 || j==0 || j==n-1 || i+j<=5|| j-i>=5 ){
        // System.out.print("*");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }System.out.println();
        // }

        // Q.4 PATTERN OF PWSKILLS

        // int n = 11;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (i == 0 || j == 0 || i == (n - 1) / 2 || j == n - 1 && i <= (n - 1) / 2) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.print(" ");
        //     for (int j = 0; j < n; j++) {
        //         if (j==0 || j==(n-1) || i+j == 10 && i>=(n-1)/2 || i==j && i>=(n-1)/2 ) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.print("    ");
        //     for (int j = 0; j < n; j++) {
        //         if (i==0 || i==(n-1) || i==(n-1)/2 || j==0 && i<=(n-1)/2 || j==(n-1)&& i>=(n-1)/2 ) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.print(" ");
        //     for (int j = 0; j < n; j++) {
        //         if (j==0|| i+j ==(n-1)/2 || i-j==(n-1)/2 ) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.print(" ");
        //     for (int j = 0; j < n; j++) {
        //         if (i==0 || i==n-1 || j==(n-1)/2) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.print("  ");
        //     for (int j = 0; j < n; j++) {
        //         if (j==0 || i==n-1 ) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.print("  ");
        //     for (int j = 0; j < n; j++) {
        //         if (j==0 || i==n-1 ) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.print(" ");
        //     for (int j = 0; j < n; j++) {
        //         if (i==0 || i==(n-1) || i==(n-1)/2 || j==0 && i<=(n-1)/2 || j==(n-1)&& i>=(n-1)/2 ) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // PATTERN OF DEEPAK BAGHEL

        // int n=7;
        // for (int i=0;i<n;i++){
        //     for (int j=0;j<n;j++){
        //         if(i==0 && j<(n-2) || i==n-1 && j<(n-2) || j==0 || j==(n-1) && i>0 && i<(n-1) ){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
    
        //     System.out.print("  ");
        //     for (int j=0;j<n;j++){
        //         if(i==0  || i==n-1 || i==(n-1)/2 || j==0){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.print("  ");
        //     for (int j=0;j<n;j++){
        //         if(i==0  || i==n-1 || i==(n-1)/2 || j==0){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.print("  ");
        //     for (int j=0;j<n;j++){
        //         if(j==0 || i==0 || i==(n-1)/2 || j==(n-1) && i<=(n-1)/2 ){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.print("  ");
        //     for (int j=0;j<n;j++){
        //         if(j==0 && i>0 || j==(n-1) && i>0 || i==0 && j>0 && j<(n-1) || i==(n-1)/2 ){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.print("  ");
        //     for (int j=0;j<n;j++){
        //         if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.print("");
        //     for (int j=0;j<n;j++){
        //         if(j==0 || i==0 && j<(n-1) || i==(n-1) && j<(n-1) || i==(n-1)/2 || j==(n-1) && i>0 && i<(n-1)){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.print("  ");
        //     for (int j=0;j<n;j++){
        //         if(j==0 || j==(n-1) || i==0 || i==(n-1)/2  ){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.print("  ");
        //     for (int j=0;j<n;j++){
        //         if(i==0 || j==0 || i==(n-1) && j<=(n-1)/2 || j==(n-1)/2 && i>=(n-1)/2 || i==(n-1)/2 && j>=(n-1)/2 || j==(n-1) && i>=(n-1)/2){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.print("  ");
        //     for (int j=0;j<n;j++){
        //         if(j==0 || j==(n-1) || i==(n-1)/2){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.print("  ");
        //     for (int j=0;j<n;j++){
        //         if(j==0 || i==0 || i==(n-1) ||i==(n-1)/2){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.print("  ");
        //     for (int j=0;j<n;j++){
        //         if(j==0 || i==(n-1)){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }

        //     System.out.println();
        // }

    }

}
