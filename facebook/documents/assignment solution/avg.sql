declare
	regno number := &regno;
	name varchar2(30) := '&name';
	m1 number := &m1 ;
	m2 number := &m2;
        m3 number := &m3;
	m4 number := &m4;
	m5 number := &m5;
        avg1 number ;
        Result varchar2(20);
    begin
    	avg1 := ((m1+m2+m3+m4+m5)/5);
    if (avg1 >= 60) then
	Result := 'First Division';
 	ElsIf(avg1 < 60 and avg1 >= 45) then
  		Result :='Second Division' ;
   			ElsIf(avg1 < 45 and avg1 >= 35) then
   				Result := 'Third Division';
 				else
   					Result := 'Failed';
    End If;
     dbms_output.put_line(name||'s Result Is '||Result||' and avg of marks is '||avg1);
 End;

