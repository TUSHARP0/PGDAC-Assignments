function computePayment(){
    var loanAmount=parseFloat(document.getElementById('amount').value);
    var roi=parseFloat(document.getElementById('rate').value);
    var period=parseFloat(document.getElementById('year').value);

    var flag1 = validateLoanAmount(loanAmount);
    var flag2 = validateRateOfInterest(roi);
    var flag3 = validateRepaymentPeriod(period);

    if(flag1 && flag2 && flag3){
        alert(flag1+" "+flag2+" "+flag3);
        var monthlyRoi=(roi/100)/12;
        alert(monthlyRoi);
    var totalPayment=period*12;
        alert(totalPayment);
    var monthlyPayment=(loanAmount*monthlyRoi*Math.pow(1+monthlyRoi,totalPayment)/(Math.pow(1+monthlyRoi,totalPayment)-1));
    alert(monthlyPayment);

    var totalPay=monthlyPayment*totalPayment;
    var totalInterest=totalPay-loanAmount;

    document.getElementById("payment").value=monthlyPayment.toFixed(2);
    document.getElementById("total").value=totalPay.toFixed(2);
    document.getElementById("interest").value=totalInterest.toFixed(2);

    }
}
function validateLoanAmount(amount){
    if(amount !== "" && !isNaN(amount)){
        if(amount<1500000){
            document.getElementById('err1').innerHTML="";
            return true;
        }else{
            document.getElementById('err1').innerHTML="Enter amount less than 15 lakhs"
            return false;
        }
        
    }else{
        document.getElementById('err1').innerHTML="Enter a valid number";
        return false;
    }
}
function validateRepaymentPeriod(year){
    if(year !== "" && !isNaN(year)){
        if(year<15 && year>7){
            document.getElementById('err3').innerHTML="";
            return true;
        }else{
            document.getElementById('err3').innerHTML="Enter a number between 7 and 15"
        }
        
    }else{
        document.getElementById('err3').innerHTML="Enter a valid number";
        return false;
    }
}
function validateRateOfInterest(rate){
    if(rate !== "" && !isNaN(rate)){
        document.getElementById('err2').innerHTML="";
        return true;
    }else{
        document.getElementById('err2').innerHTML="Enter a valid number";
        return false;
    }
}