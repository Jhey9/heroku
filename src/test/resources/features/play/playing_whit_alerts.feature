Feature: Play whit JavaScript alerts

  Rule: Use different JavaScript alerts in the automation to learn.

    @alert1
    Example: Playing whit JS Alert
      Given Jhey in browsing in javascript alerts
      When he enter in Js alert
      Then he see 'You successfully clicked an alert'

    @alert2
    Example: Playing whit Js confirm
      Given Jhey in browsing in javascript alerts
      When he enter in Js confirm
      Then he see 'You clicked: Ok' in js confirm

    @alert3
    Example: Playing whit JS Prompt
      Given Jhey in browsing in javascript alerts
      When he enter in JS Prompt
      Then see You entered 'Challenge'