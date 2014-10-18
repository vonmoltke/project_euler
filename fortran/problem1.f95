program problem1
    integer :: sum, i

    sum = 0

    do i = 1,999
        if ((modulo(i, 3) == 0) .OR. (modulo(i, 5) == 0)) then
            sum = sum + i
        end if
    end do

    print *, "The answer is", sum
end program
