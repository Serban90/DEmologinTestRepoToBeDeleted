// Create String array of three elements.
        String[] values = { "bird", "cat", "wildebeest" };
                // Join the elements together.
                String result = String.join(",", values);
                System.out.println("result = " + "\"" + result + "\"");
                System.out.println("result = " + result.toUpperCase());
                // Split on a comma.
                String parts[] = result.split(",");
                System.out.println("Avem " + parts.length +
                " cuvinte in vector");

                for(int i = 0; i< parts.length; i++)
        {
        System.out.println("parts[" + i + "] =" + parts[i]);
        }
        int index = 0;
        for (String cuvant : parts)
        {
        System.out.println("parts[" + ++index + "]= " + cuvant);
        }



