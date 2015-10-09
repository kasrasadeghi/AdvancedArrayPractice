/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedarraypractice;

/**
 *
 * @author DSTIGANT
 */
public class AdvancedArrayPractice
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int [] jenny = { 8, 6, 7, 5, 3, 0, 9 };
        String js = intArrayToString( jenny );
        
        System.out.println( "getSubArray( " + js + ", 2, 5 ) ==> " + intArrayToString( getSubArray( jenny, 2, 5) ));
        System.out.println( "getSubArray( " + js + ", 2, 2 ) ==> " + intArrayToString( getSubArray( jenny, 2, 2) ));
        System.out.println( "getSubArray( " + js + ", 3 ) ==> " + intArrayToString( getSubArray( jenny, 3) ));
        System.out.println( "getSubArray( " + js + ", 7 ) ==> " + intArrayToString( getSubArray( jenny, 7) ));
        System.out.println();
        
        int [] subarray = { 11, 28, -3, 2 };
        int [] jenny2 = { 8, 6, 7, 5, 3, 0, 9 };
        System.out.println( "copyInPlaceSubArray( " + intArrayToString(jenny2) + ", " + intArrayToString( subarray ) + ", 2 ) " );
        copyInPlaceSubArray( jenny2, subarray, 2 );
        System.out.println( "jenny2 is now:       " + intArrayToString(jenny2) );
        System.out.println();
        
        System.out.println( "copyNewSubArray( " + js + ", " + intArrayToString( subarray ) + ", 2 ) ==>" +
                intArrayToString( copyNewSubArray( jenny, subarray, 2 ) ) );
        System.out.println( "jenny is now:    " + intArrayToString( jenny ) );
        System.out.println();
        
        System.out.println( "indexOf( " + js + ", 3 ) ==> " + indexOf( jenny, 3 ) );
        System.out.println( "indexOf( " + js + ", 4 ) ==> " + indexOf( jenny, 4 ) );
        
        int [] ioa = { 4, 5, 6, 4, 5, 6 };
        System.out.println( "indexOf( " + intArrayToString( ioa ) + ", 6 ) ==> " + indexOf( ioa, 6 ) );
        System.out.println();
        
        int [] ioa2 = { 5, 6, 9 };
        int [] ioa3 = { 4, 3, 8 };
        int [] ioa4 = { };
        System.out.println( "indicesOf( " + js + ", " + intArrayToString( ioa2 ) + " ) ==> " + intArrayToString( indicesOf( jenny, ioa2 ) ) );
        System.out.println( "indicesOf( " + js + ", " + intArrayToString( ioa3 ) + " ) ==> " + intArrayToString( indicesOf( jenny, ioa3 ) ) );
        System.out.println( "indicesOf( " + js + ", " + intArrayToString( ioa4 ) + " ) ==> " + intArrayToString( indicesOf( jenny, ioa4 ) ) );
        
        System.out.println();
        
        int [] sa1 = { 5, 3, 0 };
        int [] sa2 = { 5, 3, 1 };
        int [] sa3 = { 5, 6 };
        System.out.println( "indexOfSubArray( " + js + ", " + intArrayToString( sa1 ) + " ) ==> " + indexOfSubArray( jenny, sa1 ) );
        System.out.println( "indexOfSubArray( " + js + ", " + intArrayToString( sa2 ) + " ) ==> " + indexOfSubArray( jenny, sa2 ) );
        System.out.println( "indexOfSubArray( " + js + ", " + intArrayToString( ioa4 ) + " ) ==> " + indexOfSubArray( jenny, ioa4 ) );
        System.out.println( "indexOfSubArray( " + intArrayToString( ioa ) + ", " + intArrayToString( sa3 ) + " ) ==> " + indexOfSubArray( ioa, sa3 ) );

        System.out.println();
        
        int [] cio1 = { 8, 7, 5, 9 };
        int [] cio2 = { 8, 5, 7, 9 };
        int [] cio3 = { 8, 7, 5, 1 };
        
        System.out.println( "containsInOrder( " + js + ", " + intArrayToString( cio1 ) + " ) ==> " + containsInOrder( jenny, cio1 ) );
        System.out.println( "containsInOrder( " + js + ", " + intArrayToString( cio2 ) + " ) ==> " + containsInOrder( jenny, cio2 ) );
        System.out.println( "containsInOrder( " + js + ", " + intArrayToString( cio3 ) + " ) ==> " + containsInOrder( jenny, cio3 ) );
        System.out.println( "containsInOrder( " + js + ", " + intArrayToString( ioa4 ) + " ) ==> " + containsInOrder( jenny, ioa4 ) );
        System.out.println( "containsInOrder( " + intArrayToString( cio1 ) + ", " + intArrayToString( cio1 ) + " ) ==> " + containsInOrder( ioa4, ioa4 ) );

        System.out.println();
        
        int [] arr = { 4, 5, 6, 4, 3, 6};
        System.out.println( "removePairsInPlace( " + intArrayToString(arr) + " )" );
        removePairsInPlace( arr );
        System.out.println( "arr is now          " + intArrayToString(arr) );
        
        int [] arr2 = {  4, 4, 4, 3, 3, 3, 3 };
        System.out.println( "removePairsInPlace( " + intArrayToString(arr2) + " )" );
        removePairsInPlace( arr2 );
        System.out.println( "arr2 is now         " + intArrayToString(arr2) );
        
        System.out.println( "removePairsInPlace( " + intArrayToString( jenny2 ) + " )" );
        removePairsInPlace( jenny2 );
        System.out.println( "jenny2 is now       " + intArrayToString( jenny2 ) );
        
        System.out.println();
        
        int [] meu = { 4, 3, 0, 6, 7, 0, 0, 0, 9 };
        System.out.println( "moveNonZeroElementsUp( " + intArrayToString( meu ) + " )" );
        moveNonZeroElementsUp( meu );
        System.out.println( "meu is now      " + intArrayToString( meu ) );
        
        System.out.println();
        
        System.out.println("appendArrays( " + js + ", " + intArrayToString( ioa ) + " ) ==> " + intArrayToString( horizontalConcatenate(jenny, ioa) ) );
        System.out.println("appendArrays( " + js + ", " + intArrayToString( ioa4 ) + " ) ==> " + intArrayToString( horizontalConcatenate(jenny, ioa4) ) );
        System.out.println("appendArrays( " + intArrayToString( ioa4 ) + ", " + js + " ) ==> " + intArrayToString( horizontalConcatenate(ioa4, jenny) ) );
        
        System.out.println();
        
        int [] ia = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("interleaveArrays( " + js + ", " + intArrayToString( ia ) + " ) ==> " + intArrayToString( interleaveArrays( jenny, ia ) ) );

        System.out.println();
        
        int [] dp1 = { 8, 3, 9 };
        int [] dp2 = { 4, 3, 6 };
        System.out.println( "dotProduct( " + intArrayToString( dp1 ) + ", " + intArrayToString( dp2 ) + " ) ==> " + dotProduct( dp1, dp2 ) ) ;
        System.out.println( "dotProduct( " + intArrayToString( ioa4 ) + ", " + intArrayToString( ioa4 ) + " ) ==> " + dotProduct( ioa4, ioa4 ) ) ;

    }
    
    public static String intArrayToString( int [] arr )
    {
        String scarlet = "[ ";
        for ( int i = 0; i < arr.length; i++ )
            scarlet += arr[i] + ((i < arr.length-1)?", ":" ");
        
        scarlet += "]";
        return scarlet;
    }

    // getSubArray
    // creates a new array that includes entries in the given array starting at start and ending at, but not including end
    // ex:
    // getSubArray( {8, 6, 7, 5, 3, 0, 9}, 2, 5) ==> {7, 5, 3}
    // getSubArray( {8, 6, 7, 5, 3, 0, 9}, 2, 2) ==> { }
    // inputs:
    // arr - the array to copy elements from
    // start - the starting index to copy
    // end - the ending index (do NOT include the element at end)
    // output:
    // returns a new array containing some of the elements of arr starting at start and ending one element before end
    public static int [] getSubArray( int [] arr, int start, int end )
    {
        int[] output = new int[end - start];
        for (int i = start; i < end; i++) 
            output[i - start] = arr[i];
        
        return output;
    }
    
    // getSubArray
    // creates a new array that includes entries in the given array starting at start and continuing to the end of the given array
    // ex:
    // getSubArray( {8, 6, 7, 5, 3, 0, 9}, 3 ) ==> {5, 3, 0, 9}
    // getSubArray( {8, 6, 7, 5, 3, 0, 9}, 7 ) ==> { }
    // inputs:
    // arr - the array to copy elements from
    // start - the starting index
    // output:
    // returns a new array containing some of the elements of arr starting at start and ending at the end of arr
    public static int [] getSubArray( int [] arr, int start )
    {
        int end = arr.length;
        int[] output = new int[end - start];
        for (int i = start; i < end; i++) 
            output[i - start] = arr[i];
        
        return output;
    }
    
    // copyInPlaceSubArray
    // copies a small array over a larger array starting at the indicated index by modifying the target array
    // ex:
    // int [] jenny = { 8, 6, 7, 5, 3, 0, 9 };
    // copyInPlaceSubArray( jenny, { 11, 28, -3, 2 }, 2 );
    // jenny is now { 8, 6, 11, 28, -3, 2, 9 }
    // inputs:
    // target - the larger array over which the entries of the smaller array will be copied
    // source - the smaller array which supplies the entries to copy into the larger array
    // start - the starting index of where to start copying
    public static void copyInPlaceSubArray( int [] target, int [] source, int start )
    {
        for(int i = start; i < source.length + start; i++) 
            target[i] = source[i - start];
        
    }
    
    // copyNewSubArray
    // like copyInPlaceSubArray, but returns a new array rather than modifying the old array
    // ex:
    // int [] jenny = { 8, 6, 7, 5, 3, 0, 9 };
    // copyNewSubArray( jenny, { 11, 28, -3, 2 }, 2 ) ==> { 8, 6, 11, 28, -3, 2, 9 }
    // but jenny is still { 8, 6, 7, 5, 3, 0, 9 }
    // inputs:
    // target - the target array
    // source - the source array
    // start - the starting index
    // output:
    // a new array containing the elements of target except for those that have been replaced by 
    // the elements of source
    // NOTE: the target array should not be modified by this function!
    public static int [] copyNewSubArray( int [] target, int [] source, int start )
    {
        int[] output = new int[target.length];
        for (int i = 0; i < target.length; i++) output[i] = target[i];
        for(int i = start; i < source.length + start; i++) 
            output[i] = source[i - start];
        return output;
    }
    
    // indexOf
    // checks the array to see if a given element is present in the array.  If it is, the function returns the index
    // of the first occurance of the element.  If the array does not contain that element, the result is -1.
    // ex:
    // indexOf( {8, 6, 7, 5, 3, 0, 9}, 3 ) ==> 4
    // indexOf( {8, 6, 7, 5, 3, 0, 9}, 4 ) ==> -1
    // indexOf( { 4, 5, 6, 4, 5, 6 }, 6 ) ==> 2
    // inputs:
    // arr - the array in which to find the target element
    // target - the target element
    // output:
    // returns the first index where target can be found or -1 if the array does not contain the target
    public static int indexOf( int [] arr, int target )
    {
        for (int i = 0; i < arr.length; i++) 
            if ( arr[i] == target ) 
                return i; 
        return -1;
    }
    
    // indicesOf
    // returns an array of indices of the location of elements of one array in another array
    // an entry of -1 in the output array indicates the corresponding element of the target array was not found
    // ex:
    // indicesOf( {8, 6, 7, 5, 3, 0, 9}, {5, 6, 9} ) ==> { 3, 1, 6 }
    // indicesOf( {8, 6, 7, 5, 3, 0, 9}, {4, 3, 8} ) ==> { -1, 4, 0 }
    // indicesOf( {8, 6, 7, 5, 3, 0, 9}, { } ) ==> { }
    // inputs:
    // source - the element in which to find the elements
    // target - the elements to find
    // output:
    // returns a new array of indices (or -1 for any element not found)
    // Note: there are two basic ways to do this, and you might want to try both
    // the first is to use indexOf that you wrote above
    // the second is to use nested for-loops
    public static int[] indicesOf( int [] source, int [] target )
    {
        int [] output = new int[target.length];
        for (int i = 0; i < target.length; i++) {
            output[i] = indexOf(source, target[i]);
        }
        return output;
    }
    
    // indexOfSubArray
    // checks the larger array to see if the smaller array exists as a sub array and returns the starting index
    // of the sub array or -1 if the smaller array is not contained in the larger array
    // ex:
    // indexOfSubArray( { 8, 6, 7, 5, 3, 0, 9 }, { 5, 3, 0 } ) ==> 3
    // indexOfSubArray( { 8, 6, 7, 5, 3, 0, 9 }, { 5, 3, 1 } ) ==> -1
    // indexOfSubArray( { 4, 5, 6, 4, 5, 6 }, { 5, 6 } ) ==> 1
    // indexOfSubArray( { 8, 6, 7, 5, 3, 0, 9 }, { } ) ==> 0
    // inputs:
    // source - the longer array in which to search for target
    // target - the shorter array to search for
    public static int indexOfSubArray( int [] source, int [] target )
    {
        return -1;
    }
    
    // containsInOrder
    // checks the source array to see if the elements of the target array occur in order (though not necessarily consecutively)
    // ex:
    // containsInOrder( { 8, 6, 7, 5, 3, 0, 9 }, {8, 7, 5, 9} ) ==> true
    // containsInOrder( { 8, 6, 7, 5, 3, 0, 9 }, {8, 5, 7, 9} ) ==> false
    // containsInOrder( { 8, 6, 7, 5, 3, 0, 9 }, {8, 7, 5, 1} ) ==> false
    // containsInOrder( { 8, 6, 7, 5, 3, 0, 9 }, { } ) ==> true
    // containsInOrder( { }, { } ) ==> true
    // inputs:
    // source - the array in which to find the elements of target
    // target - the elements to find in order within source
    // output:
    // returns true if the elements of target can be found in order within source, false otherwise
    public static boolean containsInOrder( int [] source, int [] target )
    {
        return false;
    }
    
    // removePairsInPlace
    // replaces any identical pairs of entries in an array with 0's.  Note that the pairs do not need to be adjacent
    // and if there are multiple items that match a given item, the first two items are replaced
    // ex:
    // int [] arr = { 4, 5, 6, 4, 3, 6};
    // removePairsInPlace( arr );
    // arr is now { 0, 5, 0, 0, 3, 0 }
    // int [] arr2 = { 4, 4, 4, 3, 3, 3, 3 }
    // removePairsInPlace( arr );
    // arr2 is now { 0, 0, 4, 0, 0, 0, 0 }
    // int [] jenny = { 8, 6, 7, 5, 3, 0, 9 };
    // removePairsInPlace( jenny )
    // jenny is unchanged (there were no pairs)
    // input:
    // arr - the array from which to remove pairs
    // note that arr will (usually) be modified by this function
    public static void removePairsInPlace( int [] arr )
    {
        
    }
    
    // moveNonZeroElementsUp
    // moves all non-zero elements up to the front of the array (or, equivalently, moves all 0 entries to the end of the array
    // ex:
    // moveNonZeroElementsUp( { 4, 3, 0, 6, 7, 0, 0, 0, 9 } ) ==> { 4, 3, 6, 7, 9, 0, 0, 0, 0 }
    // input:
    // arr - the array 
    // note that arr will (usually) be modified by this function!
    public static void moveNonZeroElementsUp( int [] arr )
    {
        
    }
    
    // horizontalConcatenate
    // produces a new array which is the elements of one array followed by the elements of a second array
    // ex:
    // horizontalConcatenate( {8, 6, 7, 5, 3, 0, 9}, {4, 5, 6, 4, 5, 6} ) ==> {8, 6, 7, 5, 3, 0, 9, 4, 5, 6, 4, 5, 6}
    // horizontalConcatenate( {8, 6, 7, 5, 3, 0, 9}, { } ) ==> {8, 6, 7, 5, 3, 0, 9}
    // horizontalConcatenate( { }, {8, 6, 7, 5, 3, 0, 9} ) ==> {8 ,6, 7, 5, 3, 0, 9}
    // inputs:
    // arr1 - the first array
    // arr2 - the second array
    // output:
    // an array which contains the elements of both arr1 and arr2
    public static int [] horizontalConcatenate( int [] arr1, int [] arr2 )
    {
        int[] output = new int[arr1.length + arr2.length];
        return new int[0];
    }
    
    // interleaveArrays
    // produces a new array which is the elements of two arrays (of equal length) interleaved (alternating)
    // ex:
    // interleaveArrays( {8, 6, 7, 5, 3, 0, 9}, {1, 2, 3, 4, 5, 6, 7}) ==> {8, 1, 6, 2, 7, 3, 5, 4, 3, 5, 0, 6, 9, 7}
    // inputs:
    // arr1 - the first array
    // arr2 - the second array
    // NOTE: arr1.length == arr2.length
    // output:
    // an array containing the elements of arr1 interleaved with those of arr2
    public static int [] interleaveArrays( int [] arr1, int [] arr2 )
    {
        return new int[0];
    }
    
    // dotProduct
    // the dot product of two vectors is the sum of the products of the corresponding elements in the vectors
    // ex:
    // dotProduct( { 8, 3, 9 }, {4, 3, 6} ) ==> 95 (8*4 + 3*3 + 9*6)
    // dotProduct( { }, { } ) ==> 0
    // inputs:
    // arr1, arr2 - two arrays of equal length representing the vectors
    // output:
    // the dot product of the two vectors
    public static int dotProduct( int [] arr1, int [] arr2 )
    {
        int output = 0;
        for (int i = 0; i < arr1.length; i++)
            output+= (arr1[i] * arr2[i]);
        return output;
    }
}
