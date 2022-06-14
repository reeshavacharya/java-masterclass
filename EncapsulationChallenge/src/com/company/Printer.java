package com.company;

public class Printer {
    private int tonerLevel=100;
    private int pages;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if(tonerLevel>-1 && tonerLevel<=100)
            {
                this.tonerLevel = tonerLevel;
            }
        this.pages = 0;
        this.isDuplex = isDuplex;
    }
    public int fillToner(int ink)
    {
        if(ink>0 && ink<=100)
        {
            if(this.tonerLevel+ink >100 )
            {
                return -1;
            }
            this.tonerLevel+=ink;
            return this.tonerLevel;
        }
        else
        {
            return -1;        }
    }
    public int printPage(int pages)
    {
        int pagesToPrint=pages;
        if(this.isDuplex)
        {
            pagesToPrint=(pages/2)+(pages%2);
            System.out.println("printing in duplex mode");
        }
        this.pages+= pagesToPrint;
        return  pagesToPrint;
    }

    public int getPages() {
        return pages;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
