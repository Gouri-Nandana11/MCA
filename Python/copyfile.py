try:
    # Open source file (read mode)
    inf = open('demoFile.txt', 'r')

    # Open destination file (write mode)
    outf = open('copy.txt', 'w')

    # Read each line and write to the new file
    for line in inf:
        outf.write(line)

    print("File copied successfully!")

except IOError as io:
    print("I/O error occurred:", io)

finally:
    # Close files if opened
    if inf:
        inf.close()
    if outf:
        outf.close()
